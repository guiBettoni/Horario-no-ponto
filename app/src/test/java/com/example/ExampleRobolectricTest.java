package com.example;

import android.content.Context;
import androidx.test.core.app.ActivityScenario;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = {34})
public class ExampleRobolectricTest {

    @Test
    public void readStringFromContext() {
        Context context = ApplicationProvider.getApplicationContext();
        String appName = context.getString(R.string.app_name);
        Assert.assertEquals("Horário no Ponto", appName);
    }

    @Test
    public void mainActivityLaunchesSuccessfully() {
        try (ActivityScenario<MainActivity> scenario = ActivityScenario.launch(MainActivity.class)) {
            scenario.onActivity(new ActivityScenario.ActivityAction<MainActivity>() {
                @Override
                public void perform(MainActivity activity) {
                    Assert.assertNotNull(activity.findViewById(R.id.btn_santa_terezinha));
                    Assert.assertNotNull(activity.findViewById(R.id.btn_jotur));
                    Assert.assertNotNull(activity.findViewById(R.id.btn_estrela));
                    Assert.assertNotNull(activity.findViewById(R.id.btn_proxima_tela));
                }
            });
        }
    }

    @Test
    public void secondActivityLaunchesSuccessfully() {
        try (ActivityScenario<SecondActivity> scenario = ActivityScenario.launch(SecondActivity.class)) {
            scenario.onActivity(new ActivityScenario.ActivityAction<SecondActivity>() {
                @Override
                public void perform(SecondActivity activity) {
                    Assert.assertNotNull(activity.findViewById(R.id.toolbar_second));
                    Assert.assertNotNull(activity.findViewById(R.id.btn_voltar));
                }
            });
        }
    }
}
