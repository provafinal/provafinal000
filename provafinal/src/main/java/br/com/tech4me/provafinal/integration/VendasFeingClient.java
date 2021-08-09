package br.com.tech4me.provafinal.integration;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.tech4me.provafinal.shared.Venda;

@FeignClient(name = "vendas-ms")
public interface VendasFeingClient {
    @GetMapping(path = "/api/vendas/{nome}/lista")
    List<Venda> obterPorVendas(@PathVariable String venda);
}
