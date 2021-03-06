package com.tanyayuferova.franklin.services;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

import com.tanyayuferova.franklin.utils.EveryDayReminderUtils;

/**
 * Reschedules every day reminder according to current device time
 *
 * Created by Tanya Yuferova on 1/4/2018.
 */

public class TimeChangeIntentService extends IntentService {

    public TimeChangeIntentService() {
        super("TimeChangeIntentService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        EveryDayReminderUtils.scheduleStartReminderJob(this);
    }
}
