

/* ********************  DO NOT USE JUET INTERNET FOR RUNNING THIS SERVLET ******************** */

package ServletClasses;


import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Abhishek Poddar 
 */

public class EmailServlet extends HttpServlet {
    int flag =0;
    String from ;
    String pass ;
    String host ;
    String recepient;
    public void init(){
        from="Email_ID"; // email id from which u want  to send msg
        recepient="XYZ"; //email id to which u want  to send msg
        pass ="Password";
        host ="smtp.gmail.com";
        
    }
    public void service(HttpServletRequest request , HttpServletResponse response) throws IOException{
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        String message1=request.getParameter("message");
        String message=message1 + "\n" + name + "\n" + email;
        
        try {
            flag = sendMessage(message);
        } catch (MessagingException ex) {
            Logger.getLogger(EmailServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(flag==1)
            response.sendRedirect("index.jsp");
        else
            response.sendRedirect("error.jsp");
        
    }
    public void destroy(){
        
    }
    public int sendMessage(String message1) throws MessagingException{
         Properties p = new Properties();
        p.put("mail.smtp.host", host);
        p.put("mail.debug", "true");
        p.put("mail.smtp.port" , 587);
        p.put("mail.smtp.auth", "true");
        
        
          Session session = Session.getInstance(p,
         new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, pass);
	   }
         });
            
        Message message = new MimeMessage(session);
        
        message.setFrom(new InternetAddress(from));
        
        InternetAddress[] address = {new InternetAddress(recepient)};
        
        message.setRecipients(Message.RecipientType.TO, address);
        
        message.setSubject("DO NOT REPLY");
        
        message.setSentDate(new Date());
        
        message.setText("Please do not reply to this message");
        
        Transport.send(message);
        
        System.out.println("Message is sent successfully");
        return 1;
        
    }
       
}
    

   
