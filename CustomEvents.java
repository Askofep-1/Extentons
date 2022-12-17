package Custom.Events;

import android.app.Activity;
import android.content.Context;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.EventDispatcher;

@DesignerComponent(
        version = 1,
        description = "This allows you to create custom events and fire them",
        category = ComponentCategory.EXTENSION,
        nonVisible = true,
        iconName = "https://lh3.googleusercontent.com/jINvzeCam8zRndIDr33EkSwohvQiVxilYDFrQ4vzVOlK_5Ol5V6mt4S1Y3wOCVYU9gDlT8nFywgk2NgXdYJDPYG7mU85_NGyr7PcKh8X-D3q97aEjqMe4D8ZGtqWz4jNRfeeISQ8NYZC_DDgzC2T4Y-LO2V8ojYHbucUrKmg7B5-fk4b_uVUx0FgPAcKCP4tRfwJclRRgRJFruqll6NCXeLx7K8Yzw4FxIFUHXSKqz6XpA7pEk8HX8xrBJ02tIi9ukY1bSe9XABopjrkQPBHUQotSxz0X-Ls07PTVlnAhDztJSUbw9wuY6aIMpq1qbRX9CTF0ATj4BiMflE_Qhi6XU9chRHU1AUwjGe46dIsfTq5W5tXyms9NrGkciZ320CTb1ss-g_Z1LK79Lb5zwvZWHMuk8NN7DtwQwiXoaKWea4wPT9Yfu1kH6X1epzA4i-hoLBC7fhwdRlPyosv5N9IG5lMTGczREpjx5jUGyBFvumdcxQa5nu5LbjYNVZkVCpqVGbO8At8pVD1Q4DPvTkHgf44n7g0Mv6EZFWeV5xUcBz41_HVizorZZyUB9ekbn6-9_cubHkTBtIYs3Q5fZ7h7kybEQoRG7jjt-DbI7pIJ-5ZEeM9FO0E-o7mvkOEBDUPNRgikJdRHFL-j6aslo9eNDUI48iv94Pu5l3f2g3CMPefV_IXiSqBxMq0vTjnEpvU--993DVsd32owNzQy3XesRnnAFoUaZ9GORbQrCUxmDA78ehJNzu9vAwkbZS_=s553-no?authuser=0")

@SimpleObject(external = true)
//Libraries
@UsesLibraries(libraries = "")
//Permissions
@UsesPermissions(permissionNames = "")

public class CustomEvents extends AndroidNonvisibleComponent {

    //Activity and Context
    private Context context;
    private Activity activity;

    public CustomEvents(ComponentContainer container){
        super(container.$form());
        this.activity = container.$context();
        this.context = container.$context();
    }
    @SimpleFunction(description = "Use this function to trigger the event.")
    public void Trigger(Object thing){
        Event(thing);
    }

    @SimpleFunction(description = "Use this function to trigger the event.")
    public boolean dispatchEvent(Object thing){
        return Event(thing);
    }

    @SimpleEvent(description = "Use the function to trigger this event.")
    public boolean Event(Object thing){
        return EventDispatcher.dispatchEvent(this, "Event", thing);
    }
}
