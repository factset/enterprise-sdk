# FactSet.SDK.RealTimePriceAlerting.Model.InlineResponse200DataTriggerPrice
Price data of the trigger.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Type of the price as configured for the customer. | Value | Description | | - -- | - -- | | trade | Trade price (ordinary, auction, pre or post-trading). | | bid | Bid price. | | ask | Ask price. |   | [optional] 
**Quality** | **string** | Price quality of the trigger. | Value | Description | | - -- | - -- | | RLT | Real-Time: intraday prices with minimal technical processing delays. | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | EOD | End-of-day: prices updated once per day after the close of trading, possibly with an exchange-imposed delay of several hours. |   | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

