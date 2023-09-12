# FactSet.SDK.DirectStreamingofTransactionMessages.Model.PlacementParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Settlementcurrencyiso** | **string** | Currency code for Settlement Value | 
**Parentid** | **string** | Unique ID of the order which spawned this placement | [optional] 
**Orderid** | **string** | Unique ID of the order which originated the record | [optional] 
**Portfolio** | **string** | Path of the portfolio (Ex: Client:/folder1/testing.ofdb) | 
**Transactionid** | **string** | Unique id for the transaction | 
**Symbol** | **string** | Symbol corresponding to the traded instrument. | 
**Description** | **string** | Description | 
**Tradetype** | **string** | Trade type could be any of the following values BL, BC, SL, SS.  which stands for Buy Long, Buy to cover, Sell Long and Sell Short respectively. | 
**Status** | **string** | Status could be any of the following value: ACCT or CNCL.  which stands for Accounted and Cancelled respectively. | 
**Tradedate** | **string** | Transaction date which is in the format YYYYMMDD | 
**Transactionleaves** | **double** | Shares that have been ordered and not executed | [optional] 
**Amount** | **double** | Quantity of the instrument traded. | 
**Currencyiso** | **string** | The currency code of cash valued fields, Net Amount and Gross Amount. | 
**Foreignexchangerate** | **float** | FX rate that can be picked up by PA, multiplied with the cash valued fields, Net, Gross, to allow PA to show transactions in reporting currency. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

