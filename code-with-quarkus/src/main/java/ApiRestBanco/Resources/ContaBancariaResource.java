package ApiRestBanco.Resources;

import ApiRestBanco.Entity.ContaBancaria;
import ApiRestBanco.Service.ContaBancariaService;
import jakarta.ws.rs.core.Response;
import jakarta.xml.bind.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class ContaBancariaResource {

    @Autowired
    private ContaBancariaService contaBancariaService;

    @PostMapping(name = "/conta")
    public Response createContaBancaria(ContaBancaria conta) throws ValidationException {
        contaBancariaService.CreateContaBancaria(conta);
        return Response.status(Response.Status.CREATED).build();
    }
}
