package med.vol.api.contrloller;


import ch.qos.logback.core.net.SyslogOutputStream;
import med.vol.api.medico.DadosCadastroMedico;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @PostMapping
    public void cadastrar (@RequestBody DadosCadastroMedico dados){
        System.out.println(dados);
    }


}
