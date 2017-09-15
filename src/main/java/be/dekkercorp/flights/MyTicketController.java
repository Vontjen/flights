package be.dekkercorp.flights;

import be.dekkercorp.flights.domain.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class MyTicketController {

    @Autowired
    TicketRepository tr;

    @RequestMapping("tickets.html")
    //@ResponseBody //maakt van de inhoud de BODY van de html pagina
    public String myBlaBlaTickets(Map<String, Object> model){
        List<Ticket> ticketList = tr.findAll();
        model.put("flightTickets", ticketList);
        return "myTicketList";
    }


}
