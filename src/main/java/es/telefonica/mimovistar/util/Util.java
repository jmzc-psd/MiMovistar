package es.telefonica.mimovistar.util;




public class Util
{

		// Inner class
		public enum ERROR_CODE
		{

			OK("000","OK"),
			GENERAL("100","GENERAL ERROR");
			
			
			private String code;
			private String description;
			
			
			ERROR_CODE(String code, String description)
			{
				this.code = code;
				this.description = description;
			}
			
			public String code()
			{
				return this.code;
			}
			
			public String description()
			{
				return this.description;
			}

		};
		
		
	
}
