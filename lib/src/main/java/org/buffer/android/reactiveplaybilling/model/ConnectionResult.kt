package org.buffer.android.reactiveplaybilling.model

import com.android.billingclient.api.BillingClient

class ConnectionResult(@BillingClient.BillingResponse val result: Int)