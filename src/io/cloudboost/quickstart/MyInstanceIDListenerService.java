package io.cloudboost.quickstart;

import io.cloudboost.push.CloudInstanceIDListenerService;

public class MyInstanceIDListenerService extends CloudInstanceIDListenerService {

	@Override
	public void onTokenRefresh() {
		super.onTokenRefresh();
		//perform custom action here
	}

}
