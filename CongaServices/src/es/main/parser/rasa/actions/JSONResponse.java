package es.main.parser.rasa.actions;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONResponse extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JSONObject object;
	
	public JSONResponse(JSONObject object) {
		super();
		this.object = object;
	}

	public JSONResponse(JSONArray jsonArray) {
		super();
		this.object = new JSONObject();
		this.object.put("obj", jsonArray);
	}

	public JSONObject getObject() {
		return object;
	}

	public void setObject(JSONObject object) {
		this.object = object;
	}
	
	

}
