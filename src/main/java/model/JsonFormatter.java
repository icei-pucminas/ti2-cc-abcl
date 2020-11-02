package model;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * Interface que declara o protocolo para conversão de um objeto Java em JSON.
 * 
 * @author Prof. Hugo de Paula
 *
 */
public interface JsonFormatter {
	public JsonObject toJson();

	public default JsonArray toJsonArray() {
		JsonArray jsonArray = new JsonArray();
		jsonArray.add(toJson());
		return jsonArray;
	}
}
