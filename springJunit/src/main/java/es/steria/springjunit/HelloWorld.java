package es.steria.springjunit;

import java.io.Serializable;

public class HelloWorld implements Serializable {

	private static final long serialVersionUID = 1L;

	private String message;

	public HelloWorld(){
		this.message = "Hello world. Default setting.";
	}

	public HelloWorld(final String message){
		this.message = message;
	}

	public final String getMessage() {
		return message;
	}

	public final void setMessage(final String message) {
		this.message = message;
	}

	@Override
	public final String toString() {
		return new StringBuilder().append("HelloWorld [message=").append(message)
				.append("]").toString();
	}

	public final String greet(){
		return this.message;
	}

}
