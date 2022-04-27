package cordova.plugin.sabpaisa;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class SabPaisa extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("makePayment")) {
            this.makePayment(args, callbackContext);
            return true;
        }
        return false;
    }

   public void makePayment(JSONArray args, CallbackContext callback) {
        if(args != null){
                try
                {
                    callback.success("funtion got hit successfully");
                }catch(Exception ex){
                    callback.error("something went wrong" + ex);
                }
        }else{
            callback.error("Do not pass empty value" + ex);
        }
    }
}
