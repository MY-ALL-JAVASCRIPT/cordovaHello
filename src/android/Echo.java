package com.example.plugin;

import org.apache.cordova.*;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;



public class Echo extends CordovaPlugin {

    public Echo() { }

    /**
     * Executes the request and returns PluginResult.
     *
     * @param action            The action to execute.
     * @param args              JSONArry of arguments for the plugin.
     * @param callbackContext   The callback id used when calling back into JavaScript.
     * @return                  True if the action was valid, false if not.
     */
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        JSONObject r = new JSONObject();
        r.put("uuid", "subrat");
        callbackContext.success(r);
        callbackContext.error("MSG_NOT_SUPPORTED");
        return true;
    }

}
