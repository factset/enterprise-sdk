# ExecutionParameters


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**net** | **float** | Cash value of the transaction, net of brokerage costs. | 
**gross** | **float** | Cash value of the transaction, including brokerage costs | 
**settlementvalue** | **float** | Cash value of the transaction, a value that has been multiplied by an applicable FX rates to convert the a transacti | 
**settlementdate** | **str** | Settlement date in YYYYMMDD format | 
**portfolio** | **str** | Path of the portfolio (Ex: Client:/folder1/testing.ofdb) | 
**transactionid** | **str** | Unique id for the transaction | 
**symbol** | **str** | Symbol corresponding to the traded instrument. | 
**tradetype** | **str** | Trade type could be any of the following values BL, BC, SL, SS.  which stands for Buy Long, Buy to cover, Sell Long and Sell Short respectively. | 
**status** | **str** | Status could be any of the following value: ACCT or CNCL.  which stands for Accounted and Cancelled respectively. | 
**tradedate** | **str** | Transaction date which is in the format YYYYMMDD | 
**amount** | **float** | Quantity of the instrument traded. | 
**currencyiso** | **str** | The currency code of cash valued fields, Net Amount and Gross Amount. | 
**settlementcurrencyiso** | **str, none_type** | Currency code for Settlement Value | [optional] 
**description** | **str, none_type** | Description | [optional] 
**transactionleaves** | **float** | Shares that have been ordered and not executed | [optional] 
**foreignexchangerate** | **float** | FX rate that can be picked up by PA, multiplied with the cash valued fields, Net, Gross, to allow PA to show transactions in reporting currency. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


