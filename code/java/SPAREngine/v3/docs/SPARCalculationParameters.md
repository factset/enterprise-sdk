

# SPARCalculationParameters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**componentid** | **String** | The SPAR Engine component identifier to analyze. | 
**accounts** | [**java.util.List&lt;SPARIdentifier&gt;**](SPARIdentifier.md) | List of accounts for SPAR calculation. |  [optional]
**benchmark** | [**SPARIdentifier**](SPARIdentifier.md) |  |  [optional]
**dates** | [**SPARDateParameters**](SPARDateParameters.md) |  |  [optional]
**currencyisocode** | **String** | Currency ISO code for calculation. |  [optional]
**universeid** | **String** | Universe ID code for calculation. Can be fetched from peer universe endpoint(/analytics/engines/spar/v3/peer-universe) |  [optional]


## Implemented Interfaces

* Serializable


