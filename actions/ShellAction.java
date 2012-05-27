package servershell.actions;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;

public class ShellAction extends ActionSupport {
	
	 
	private static final long serialVersionUID = 1L;
	private static Logger logger = LoggerFactory.getLogger(ShellAction.class);
	
	public String execute(){
			logger.info("This is from log back");
			logger.debug("This is logback debug");
		return SUCCESS;
	}
}
