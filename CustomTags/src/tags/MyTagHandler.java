package tags;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

// 1. creating a TagHandler class by inheriting the TagSupport class

public class MyTagHandler extends TagSupport {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public int doStartTag() throws JspException {
		
		try {
			
			JspWriter out = pageContext.getOut();
			
			out.println("<h2>Welcome to the custom tag world!!!</h2>");
			out.println("<h5>At date : " + new Date().toString() + "</h5>");
			
			out.close();
			
		}
		catch (Exception ex) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			ex.printStackTrace(pw);
			String error = sw.toString();
			System.out.println("Error : \n" + error);
		}
		
		return SKIP_BODY;
	}

}
