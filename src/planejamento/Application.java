package planejamento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {

	private static List<Recurso> carregarRecursos() {
		List<Recurso> recursos = new ArrayList<>();
        recursos.add(new Recurso("CPU 1", 35, 17));
        recursos.add(new Recurso("CPU 2", 25, 8));
        recursos.add(new Recurso("Disco Rápido", 40, 15));
        recursos.add(new Recurso("Disco Lento", 90, 9));
		return recursos;
	}
	
	public static void main(String[] args) {

		Map<Integer, List<Recurso>> map = new HashMap<>();
		List<Recurso> recursos = carregarRecursos();
		recursos.forEach(r -> r.setClientes(0));
		map.put(0, recursos);
		
		for(int i = 1; i < 100; i++) {
			recursos = carregarRecursos();
			for(int j = 0; j < recursos.size(); j++) {
				recursos.get(j).setTempoResposta(recursos.get(j).getTempo() * (1 + map.get(i-1).get(j).getClientes()));
				System.out.println("R " + recursos.get(j).getNome() + ":" + recursos.get(j).getTempoResposta());
			};
			
			double R = 0;
			for(Recurso r : recursos)
				R += r.getTempoResposta() * r.getVisita();
			System.out.println("R: " + R);
			
			double X = i / R;
			System.out.println("X: " + X);
			
			recursos.forEach(r -> {
				r.setThroughput(r.getVisita() * X);
				System.out.println("X " + r.getNome() + ":" + r.getThroughput());
			});

			recursos.forEach(r -> {
				r.setUtilizacao(r.getTempo() * r.getThroughput());
				System.out.println("Utilizacao " + r.getNome() + ":" + r.getUtilizacao());
			});

			recursos.forEach(r -> {
				r.setClientes(r.getTempoResposta() * r.getThroughput());
				System.out.println("Clientes " + r.getNome() + ":" + r.getClientes());
			});
			map.put(i, recursos);
		}
		
	}
	
}
