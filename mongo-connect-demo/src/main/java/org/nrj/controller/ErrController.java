package org.nrj.controller;

import javax.servlet.http.HttpServletRequest;

import org.nrj.utils.Constants;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrController implements ErrorController {

	@RequestMapping(Constants.ERROR_URL)
	public String handleError(HttpServletRequest request) {
		Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
		Exception exception = (Exception) request.getAttribute("javax.servlet.error.exception");
		return String.format("<html><body><h2>" + Constants.ERROR_STRING + "</h2><div>Status code: <b>%s</b></div>"
				+ "<div>Exception Message: <b>%s</b></div><body></html>",
				statusCode, exception==null? "N/A": exception.getMessage());
	}

	@Override
	public String getErrorPath() {
		return Constants.ERROR_URL;
	}
}
