package machinepage.infra;
import machinepage.domain.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;


@RestController
// @RequestMapping(value="/machines")
@Transactional
public class MachineController {
    @Autowired
    MachineRepository machineRepository;




    @PutMapping("/machines/search/")
    public Object (@RequestBody  query){
        return machineRepository.();
    }
}
