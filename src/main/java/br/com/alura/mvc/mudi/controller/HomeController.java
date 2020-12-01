package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Cadeira GamerTurbo");
		pedido.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/513IXyWxsdL._AC_SX679_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Cadeira-Gamer-Racer-Turbo-Branca/dp/B08CHKVNYW/ref=sr_1_1?dchild=1&keywords=cadeira+gamer&pd_rd_r=131cf0b7-3dfd-4a6a-9e5b-a1e4384b4cae&pd_rd_w=ev5Us&pd_rd_wg=G1ehI&pf_rd_p=2322eb50-0b60-4f36-9477-fad000a09ea8&pf_rd_r=08PFKWB9EMF6CRQHT9AM&qid=1606841611&sr=8-1");
		pedido.setDescricao("Cadeira Gamer Turbo");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		return "home";
	}
}
