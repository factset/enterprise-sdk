# FactSet.SDK.FactSetOptions.Model.IdType
Controls the type of option id or symbol returned in response of the Option Chain. For more details visit - [OA 12636](https://my.apps.factset.com/oa/pages/12636#options)   |idType|Type Name|Description|   |- --|- --|- --|   |FOS|FactSet Option Symbology|This option symbol is a unique FactSet-generated symbol with the following syntax - (Underlying Symbol + . + Region + # + Call/Put Indicator + Four Alphanumeric Characters + - + ISO)|   |OCC21|Options Clearing Corporation OSI Series Key|This option symbol has up to 21 alphanumeric characters (excluding -ISO and # sign) and uses the following syntax- (Underlying Symbol + # + Expiration Year + Expiration Month + Expiration Day + Call/Put Indicator + Five-Digit Strike Dollar + Three-Digit Strike Decimal + - + ISO)|   |OPRA17|Options Price Reporting Authority's OSI Series Key|This option symbol has up to 17 alphanumeric characters (excluding the -ISO and #) and uses the following syntax - (Underlying Symbol + # + Call/Put Expiration Month Code + Expiration Day + Expiration Year + Decimal Indicator + Strike Price + - + ISO)|

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

