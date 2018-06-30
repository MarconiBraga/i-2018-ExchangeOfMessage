package com.github.marconibraga.perguntas;

import javax.jms.JMSException;
import javax.jms.Message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessagePostProcessor;
import org.springframework.stereotype.Component;

import com.github.marconibraga.enums.CategoriaPerguntas;
import com.github.marconibraga.model.Pergunta;

@Component
public class PerguntasProducer {

	@Autowired
	JmsTemplate jmsTemplate;
	
	@Value("${jsa.activemq.queue.producer}")
	String queueProducer;
	
	public void pushPerguntasGeografia(CategoriaPerguntas categoriaPerguntas) throws JMSException {
		Pergunta pergunta = PerguntasBuilder.constroiPergunta(categoriaPerguntas);
		
//		String json = new Gson().toJson(pergunta, Pergunta.class);
//		System.out.println(json);
		
		jmsTemplate.convertAndSend(queueProducer, pergunta, new MessagePostProcessor() {
	        public Message postProcessMessage(Message message) throws JMSException {
	            message.setStringProperty("solicitante", "Marconi Braga");
	            return message;
	        }
	    });
	}
}