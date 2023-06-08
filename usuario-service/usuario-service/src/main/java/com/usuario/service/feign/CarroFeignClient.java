package com.usuario.service.feign;

/**import com.usuario.service.models.Carro;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="carro-service", url="http://localhost:8082")
@RequestMapping("/carro")
public interface CarroFeignClient {
    @PostMapping()
    public Carro save(@RequestBody Carro carro);
}
**/

import com.usuario.service.models.Carro;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "carro-service", url = "http://localhost:8082")
public interface CarroFeignClient {
    @PostMapping("/carro") // Mueve la anotación @RequestMapping a este método
    public Carro save(@RequestBody Carro carro);

    @GetMapping("/carro/usuario/{usuarioId}")
    public List<Carro> getCarros(@PathVariable("usuarioId")int usuarioId);
}
