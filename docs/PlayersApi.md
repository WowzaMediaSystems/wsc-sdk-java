# PlayersApi

All URIs are relative to *https://api.cloud.wowza.com/api/v1.3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPlayerUrl**](PlayersApi.md#createPlayerUrl) | **POST**players/{player_id}/urls | Create a player URL
[**deletePlayerUrl**](PlayersApi.md#deletePlayerUrl) | **DELETE**players/{player_id}/urls/{id} | Delete a player URL
[**listPlayerUrls**](PlayersApi.md#listPlayerUrls) | **GET**players/{player_id}/urls | Fetch all player URLs
[**listPlayers**](PlayersApi.md#listPlayers) | **GET**players | Fetch all players
[**requestPlayerRebuild**](PlayersApi.md#requestPlayerRebuild) | **POST**players/{id}/rebuild | Rebuild player code
[**showPlayer**](PlayersApi.md#showPlayer) | **GET**players/{id} | Fetch a player
[**showPlayerState**](PlayersApi.md#showPlayerState) | **GET**players/{id}/state | Fetch the state of a player
[**showPlayerUrl**](PlayersApi.md#showPlayerUrl) | **GET**players/{player_id}/urls/{id} | Fetch a player URL
[**updatePlayer**](PlayersApi.md#updatePlayer) | **PATCH**players/{id} | Update a player
[**updatePlayerUrl**](PlayersApi.md#updatePlayerUrl) | **PATCH**players/{player_id}/urls/{id} | Update a player URL


<a name="createPlayerUrl"></a>
# **createPlayerUrl**
> Url createPlayerUrl(playerId, url)

Create a player URL

This operation creates a new player URL.

### Example
```java
// Import classes:
package Players;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.PlayersApi;

import java.io.File;
import java.util.*;

public class AddUrlToAPlayerExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	PlayersApi apiInstance = new PlayersApi();
	String playerId = "xxxxxx";
	try {
		Url newUrl = new Url();
		newUrl.setBitrate(990099);
		newUrl.setHeight(1080);
		newUrl.setWidth(1920);
		newUrl.setId("Private ID URL test");
		newUrl.setLabel("Private Label URL Test");
		newUrl.setUrl("https://www.wowza.com/players/testplayer/player99099/playlist.m3u8");
		newUrl.setPlayerId(playerId);

		Url result = apiInstance.createPlayerUrl(playerId,newUrl);
		System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling PlayersApi#createPlayerUrl");
	    e.printStackTrace();
	}
    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerId** | **String**| The unique alphanumeric string that identifies the player. |
 **url** | [**Url**](Url.md)| Provide the details of the player URL to create. |

### Return type

[**Url**](Url.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePlayerUrl"></a>
# **deletePlayerUrl**
> deletePlayerUrl(playerId, id)

Delete a player URL

This operation deletes a player URL. 

### Example
```java
// Import classes:
package Players;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.PlayersApi;

import java.io.File;
import java.util.*;

public class DeleteAPlayerUrlExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	PlayersApi apiInstance = new PlayersApi();
	String playerId = "xxxxxx";
	String urlId = "xxxxxx";
	try {
		apiInstance.deletePlayerUrl(playerId,urlId);
	} catch (ApiException e) {
	    System.err.println("Exception when calling PlayersApi#deletePlayerUrl");
	    e.printStackTrace();
	}
    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerId** | **String**| The unique alphanumeric string that identifies the player. |
 **urlId** | **String**| The unique alphanumeric string that identifies the player URL. |

### Return type

null (empty response body)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listPlayerUrls"></a>
# **listPlayerUrls**
> List<Url> listPlayerUrls(playerId)

Fetch all player URLs

This operation shows the details of all player URLs.

### Example
```java
// Import classes:
package Players;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.PlayersApi;

import java.io.File;
import java.util.*;

public class FetchAllPlayerUrlsExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	PlayersApi apiInstance = new PlayersApi();
	String playerId = "xxxxxx";
	try {
	    List<Url> result = apiInstance.listPlayerUrls(playerId);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling PlayersApi#listPlayerUrls");
	    e.printStackTrace();
	}
    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerId** | **String**| The unique alphanumeric string that identifies the player. |

### Return type

[**List<Url>**](Url.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listPlayers"></a>
# **listPlayers**
> List<IndexPlayer> listPlayers(page, perPage)

Fetch all players

This operation shows limited details for all of your players. For detailed information, fetch a single player.

### Example
```java
// Import classes:
package Players;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.PlayersApi;

import java.io.File;
import java.util.*;

public class FetchAllPlayersExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	PlayersApi apiInstance = new PlayersApi();
	Integer page = 1; 
	Integer perPage = 56; 
	try {
	    List<IndexPlayer> result = apiInstance.listPlayers(page, perPage);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling PlayersApi#listPlayers");
	    e.printStackTrace();
	}
    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Returns a paginated view of results from the HTTP request. Specify a positive integer to indicate which page of the results should be displayed. The default is **1**. For more information and examples, see &lt;a href&#x3D;&#39;https://www.wowza.com/docs/how-to-get-paginated-query-results-with-the-wowza-streaming-cloud-rest-api&#39; target&#x3D;&#39;_blank&#39;Get paginated query results with the Wowza Streaming Cloud REST API&lt;/a. | [optional]
 **perPage** | **Integer**| For use with the *page* parameter. Indicates how many records should be included in a page of results. A valid value is any positive integer. The default and maximum value is **1000**. | [optional]

### Return type

[**List<IndexPlayer>**](IndexPlayer.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="requestPlayerRebuild"></a>
# **requestPlayerRebuild**
> PlayerState requestPlayerRebuild(id)

Rebuild player code

This operation rebuilds the player with the current configuration.

### Example
```java
// Import classes:
package Players;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.PlayersApi;

import java.io.File;
import java.util.*;

public class RebuildAPlayerExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	PlayersApi apiInstance = new PlayersApi();
	String playerId = "xxxxxx";
	try {
	    PlayerState result = apiInstance.requestPlayerRebuild(playerId);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling PlayersApi#requestPlayerRebuild");
	    e.printStackTrace();
	}
    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerId** | **String**| The unique alphanumeric string that identifies the player. |

### Return type

[**PlayerState**](PlayerState.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showPlayer"></a>
# **showPlayer**
> Player showPlayer(id)

Fetch a player

This operation shows details of a specific player.

### Example
```java
// Import classes:
package Players;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.PlayersApi;

import java.io.File;
import java.util.*;

public class FetchAPlayerExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	PlayersApi apiInstance = new PlayersApi();
	String playerId = "xxxxxx";
	try {
	    Player result = apiInstance.showPlayer(playerId);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling PlayersApi#showPlayer");
	    e.printStackTrace();
	}
    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the player. |

### Return type

[**Player**](Player.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showPlayerState"></a>
# **showPlayerState**
> PlayerState showPlayerState(id)

Fetch the state of a player

This operation shows the current state of a player.

### Example
```java
// Import classes:
package Players;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.PlayersApi;

import java.io.File;
import java.util.*;

public class FetchStateOfPlayerExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	PlayersApi apiInstance = new PlayersApi();
	String playerId = "xxxxxx";
	try {
	    PlayerState result = apiInstance.showPlayerState(playerId);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling PlayersApi#showPlayerState");
	    e.printStackTrace();
	}
    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the player. |

### Return type

[**PlayerState**](PlayerState.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showPlayerUrl"></a>
# **showPlayerUrl**
> Url showPlayerUrl(playerId, id)

Fetch a player URL

This operation shows the details of a player URL.

### Example
```java
// Import classes:
package Players;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.PlayersApi;

import java.io.File;
import java.util.*;

public class FetchUrlFromAPlayerExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	PlayersApi apiInstance = new PlayersApi();
	String playerId = "xxxxxx";
	String urlId = "xxxxxx";
	try {

		Url result = apiInstance.showPlayerUrl(playerId,urlId);
		System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling PlayersApi#showPlayerUrl");
	    e.printStackTrace();
	}
    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerId** | **String**| The unique alphanumeric string that identifies the player. |
 **urlId** | **String**| The unique alphanumeric string that identifies the player URL. |

### Return type

[**Url**](Url.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePlayer"></a>
# **updatePlayer**
> InlineResponse200 updatePlayer(id, player)

Update a player

This operation updates a player.

### Example
```java
// Import classes:
package Players;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.PlayersApi;

import java.io.File;
import java.util.*;

public class UpdateAPlayerExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	PlayersApi apiInstance = new PlayersApi();
	String playerId = "xxxxxx";
	try {
	    Player result = apiInstance.showPlayer(playerId);
	    System.out.println(result);

	    result.setHostedPageTitle("Wowza Broadcast");
	    Player resultUpdate = apiInstance.updatePlayer(playerId, result);

	    System.out.println(result);
	    System.out.println(resultUpdate);

	} catch (ApiException e) {
	    System.err.println("Exception when calling PlayersApi#updatePlayer");
	    e.printStackTrace();
	}
    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerId** | **String**| The unique alphanumeric string that identifies the player. |
 **player** | [**Player**](Player.md)| Provide the details of the player to update. |

### Return type

[**Player**](Player.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePlayerUrl"></a>
# **updatePlayerUrl**
> Url updatePlayerUrl(playerId, id, url)

Update a player URL

This operation updates a player URL.

### Example
```java
// Import classes:
package Players;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.PlayersApi;

import java.io.File;
import java.util.*;

public class UpdateAPlayerUrlExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	PlayersApi apiInstance = new PlayersApi();
        String playerId = "xxxxxx";
        String urlId = "xxxxxx";
        try {

                Url result = apiInstance.showPlayerUrl(playerId,urlId);
	    	System.out.println(result);
		result.setBitrate(1990099);

		Url resultUpdate = apiInstance.updatePlayerUrl(playerId, urlId, result);

	    	System.out.println(resultUpdate);

	} catch (ApiException e) {
	    System.err.println("Exception when calling PlayersApi#updatePlayerUrl");
	    e.printStackTrace();
	}
    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerId** | **String**| The unique alphanumeric string that identifies the player. |
 **urlId** | **String**| The unique alphanumeric string that identifies the player URL. |
 **url** | [**Url**](Url.md)| Provide the details of the player URL to update. |

### Return type

[**Url**](Url.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

