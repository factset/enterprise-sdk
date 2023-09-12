# directstreamingoftransactionmessages.ExecutionParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parentid** | **String** | Unique ID of the placement which spawned this execution | [optional] 
**net** | **Number** | Cash value of the transaction, net of brokerage costs. | 
**gross** | **Number** | Cash value of the transaction, including brokerage costs | 
**settlementvalue** | **Number** | Cash value of the transaction, a value that has been multiplied by an applicable FX rates to convert the a transacti | 
**settlementdate** | **String** | Settlement date in YYYYMMDD format | 
**settlementcurrencyiso** | **String** | Currency code for Settlement Value | 
**orderid** | **String** | Unique ID of the order which originated the record | [optional] 
**portfolio** | **String** | Path of the portfolio (Ex: Client:/folder1/testing.ofdb) | 
**transactionid** | **String** | Unique id for the transaction | 
**symbol** | **String** | Symbol corresponding to the traded instrument. | 
**description** | **String** | Description | 
**tradetype** | **String** | Trade type could be any of the following values BL, BC, SL, SS.  which stands for Buy Long, Buy to cover, Sell Long and Sell Short respectively. | 
**status** | **String** | Status could be any of the following value: ACCT or CNCL.  which stands for Accounted and Cancelled respectively. | 
**tradedate** | **String** | Transaction date which is in the format YYYYMMDD | 
**transactionleaves** | **Number** | Shares that have been ordered and not executed | [optional] 
**amount** | **Number** | Quantity of the instrument traded. | 
**currencyiso** | **String** | The currency code of cash valued fields, Net Amount and Gross Amount. | 
**foreignexchangerate** | **Number** | FX rate that can be picked up by PA, multiplied with the cash valued fields, Net, Gross, to allow PA to show transactions in reporting currency. | [optional] 


