<p align="center">
    <a href="https://cobinhood.com" target="_blank"><img width="140"src="https://github.com/morpheums/Cobinhood.API.Csharp.Client/blob/master/Cobinhood.API.Csharp.Client/CobinhoodLogo.png?raw=true">       
    </a>    
    </br>
    <b style="font-size: 22px;">Cobinhood Java Rx Client</b>
    <br>
    <small style="font-size: 14px;">Java/Android client for Cobinhood Exchange API.</small>
</p>

### Java/Android client for Cobinhood Exchange API.
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg?style=flat-square)]

## Features
- **Very easy** to understand and get started.
- **Complete implementation** of the Cobinhood API and soon WebSockets.
- API results **deserialized** to concrete objects for ease of usage.
- Includes a **ready to go** test project with **all possible API calls**, just provide your API Key and start testing.

## Installation

---

# Gradle Dependency


#### Repository

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

#### Dependency

Add this to your module's `build.gradle` file:

```gradle
dependencies {
	...
	compile 'com.github.jd-alexander:CobinhoodJava:0.1.0'
	}
}
```

## Getting Started
In order to use signed methods you need to [create a Cobinhood account](https://cobinhood.com/), if you already have one, go to your account and create a new API private key.

Create an instance of the **ApiClient** which receive the following parameters:

* **ApiKey** - *Key used to authenticate within the API.*
* **Logging Interceptor (Optional)** - *Allows you to pass interceptors to OKHttp.*
```java
cobinhoodService = new CobinhoodApi.Builder()
                .setLoggingInterceptor(logging)
                .setAccessToken("ApiKey")
                .build();
```


## Documentation and Examples
- [System Methods](/Documentation/SystemMethods.md)
- [Market Methods](/Documentation/MarketMethods.md)
- [Chart Methods](/Documentation/ChartMethods.md)
- [Trading Methods](/Documentation/TradingMethods.md)
- [Wallet Methods](/Documentation/WalletMethods.md)
- [WebSocket Methods](/Documentation/WebSocketMethods.md)

## License
Cobinhood.Java is open-sourced software licensed under the [MIT license](http://opensource.org/licenses/MIT)

## Code of Conduct
Please read and follow our [Code of Conduct](CODE_OF_CONDUCT.md).
