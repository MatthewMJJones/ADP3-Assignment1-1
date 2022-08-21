package za.ac.cput.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.Domain.Entity.StudentAccount;
import za.ac.cput.Service.Impl.StudentAccountService;
import za.ac.cput.Service.Impl.StudentAccountServiceImpl;

import java.util.List;

/**
 *
 * Keziah Robinson
 * 219113149
 * Student Account Controller
 *
 */

@RestController
@RequestMapping("/studentAccount")
public class StudentAccountController {

    private final StudentAccountService studentAccountService;
    private final static Logger log = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    public StudentAccountController(StudentAccountServiceImpl studentAccountService){
        this.studentAccountService = studentAccountService;
    }

    @PostMapping
    public StudentAccount save(StudentAccount studentAccount) {
        StudentAccount studentAccounts = studentAccountService.save(studentAccount);
        return studentAccounts;
    }

    @GetMapping
    public StudentAccount read(StudentAccount studentAccount){
        StudentAccount studentAccounts  = studentAccountService.read(studentAccount).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return studentAccounts;
    }

    @DeleteMapping
    public void delete(StudentAccount studentAccount){
        log.info("Delete student: {}", studentAccount);
        this.delete(studentAccount);
    }

    @PutMapping
    public StudentAccount update(StudentAccount studentAccount){
        StudentAccount studentAccounts = studentAccountService.update(studentAccount);
        return studentAccounts;
    }
//
//    @GetMapping("readAll")
//    public ResponseEntity<List<StudentAccount>> readAll(){
//        List<StudentAccount>studentAccounts = this.studentAccountService.readAll();
//        return ResponseEntity.ok(studentAccounts);
//    }





}
