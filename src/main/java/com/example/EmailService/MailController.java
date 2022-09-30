
package com.example.EmailService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@ResponseBody
public class MailController {
    @RequestMapping("/")
    // @ResponseBody
    private String getMailResponse() {
    String uri = "http://172.19.56.80/MailService/Afriland/api/v1/SendMail";
    RestTemplate restTemplate = new RestTemplate();

    // create object
    Mail mail = new Mail();
    mail.setTo("ouattaralagninyismael@gmail.com");
    mail.setSubject("test");
    mail.setEmailBody("Cher Donald, Juste un test a partir du web service.");
    mail.setCopy("ismael.ouattara@afrilandfirstbankgroup.com");
    mail.setAttachment("C:\\CommitmentTracking\\File\\Transactional_Licensing_Comparison_Chart.pdf");
    
    MailResponse mailResponse = restTemplate.postForEntity(uri, mail, MailResponse.class).getBody();
    System.out.println("Response: " + mailResponse);
    
        return "Code: " + mailResponse.getCode() + " Message: " + mailResponse.getMessage();
    }
}
