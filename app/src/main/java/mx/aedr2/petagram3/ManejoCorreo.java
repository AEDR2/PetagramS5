package mx.aedr2.petagram3;

//Ejemplo sacado de http://www.chuidiang.org/java/herramientas/javamail/enviar-correo-javamail.php

import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Created by alejandraperez on 16/09/17.
 */
public class ManejoCorreo {
    private String nombrePersona, mensajePersona, correoPersona;
    private final String correoPersonal = "correo@ejemplo.com";
    private final String contrasenaPersonal = "contrasena";


    public ManejoCorreo(String nombrePersona, String mensajePersona, String correoPersona) {
        this.nombrePersona = nombrePersona;
        this.mensajePersona = mensajePersona;
        this.correoPersona = correoPersona;

    }

    public boolean enviarCorreo() {
        try {
            /*Properties propiedades = new Properties();
            propiedades.setProperty("mail.smtp.host", "smtp.gmail.com");
            propiedades.setProperty("mail.smtp.starttls.enable", "true");
            propiedades.setProperty("mail.smtp.port", "587");
            propiedades.setProperty("mail.smtp.user", correoPersonal);
            propiedades.setProperty("mail.smtp.auth", "true");*/

            Properties props = new Properties();

            //Configuring properties for gmail
            //If you are not using gmail you may need to change the values
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "465");

            Session sesion = Session.getDefaultInstance(props,
                    new javax.mail.Authenticator() {
                        //Authenticating the password
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(correoPersonal, contrasenaPersonal);
                        }
                    });

            // Construimos el mensaje
            MimeMessage message = new MimeMessage(sesion);
            message.setFrom(new InternetAddress(correoPersonal));
            message.addRecipient(
                    Message.RecipientType.TO,
                    new InternetAddress(correoPersona));
            message.setSubject("Contacto de " + nombrePersona);
            message.setText(mensajePersona);

            // Lo enviamos.
            //Transport t = sesion.getTransport("smtp");
            //t.connect(correoPersonal, contrasenaPersonal);
            //t.sendMessage(message, message.getAllRecipients());

            // Cierre.
            //t.close();
            Transport.send(message);
            return true;
        }
        catch (Exception e) {
            System.out.println("errrrrroooooorr" + e.getMessage());
            return false;
        }
    }
}