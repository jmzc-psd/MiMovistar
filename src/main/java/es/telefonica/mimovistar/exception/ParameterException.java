package es.telefonica.mimovistar.exception;


import es.telefonica.mimovistar.util.Util;

public class ParameterException extends Exception
{


	private static final long serialVersionUID = 1L;

	private String parameter;
	private String reason;
	
	private Util.ERROR_CODE code = Util.ERROR_CODE.GENERAL;
	

	public Util.ERROR_CODE getCode()
	{
		return code;
	}



	public ParameterException(String parameter,  String reason)
	{
		super();
		this.parameter = parameter;
		this.reason = reason;
	}


	public String getParameter()
	{
		return parameter;
	}



	public void setParameter(String parameter)
	{
		this.parameter = parameter;
	}


	public String getReason()
	{
		return reason;
	}


	public void setReason(String reason)
	{
		this.reason = reason;
	}


	public String getDescription()
	{
		
		return String.format("[%s][%s][%s]", this.code.description(),this.getParameter(), this.getReason());
	}
	
	


	
	
	
	
}
