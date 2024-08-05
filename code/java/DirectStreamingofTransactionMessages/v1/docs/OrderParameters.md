

# OrderParameters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionStatus** | **String** | Transaction Status of an Order could be any of the following values: PendingApproval, Open, Placed, PartialFilled, Filled, Expired, Cancelled, Rejected, Booked. | 
**instructionType** | **String** | Instruction Type of an Order could be any of the following values: Market, Limit, Stop |  [optional]
**instructionValue** | **Double** | Instruction Value of an Order |  [optional]
**tif** | **String** | TIF of an Order could be any of the following values: GTC, GTD, D, W |  [optional]
**tifDate** | **String** | TIF date which is in the format YYYY-MM-DD |  [optional]
**fundTeam** | **String** | Fund Team of an Order |  [optional]
**tradingTeam** | **String** | Trading Team of an Order |  [optional]
**trader** | **String** | User Id of assigned trader. |  [optional]
**transactionId** | **String** | Unique Id for the transaction | 
**orderId** | **String** | Unique Id of the order which originated the record |  [optional]
**portfolio** | **String** | Path of the portfolio (Ex: Client:/folder1/testing.ofdb) | 
**symbol** | **String** | Symbol corresponding to the traded instrument. | 
**description** | **String** | Description | 
**tradeType** | **String** | Trade type could be any of the following values BL, BC, SL, SS.  which stands for Buy Long, Buy to cover, Sell Long and Sell Short respectively. | 
**unitType** | **String** | Unit type could be one of Quantity or Value. | 
**transactionLeaves** | **Double** | Shares that have been ordered and not executed |  [optional]
**quantity** | **Double** | Quantity of the instrument traded. | 
**gross** | **Double** | Cash value of the transaction | 
**price** | **Double** | The transaction price |  [optional]
**currencyISO** | **String** | The currency code of cash valued fields, Net Amount and Gross Amount. | 
**tradeDate** | **String** | Trade date which is in the format YYYY-MM-DD | 
**addedDateTime** | **String** | Date and time expressed in UTC when the transaction was first added in the format YYYY-MM-DDTHH:MM:SS.FFF |  [optional]
**updatedDateTime** | **String** | Date and time expressed in UTC when the transaction was last updated in the format YYYY-MM-DDTHH:MM:SS.FFF |  [optional]
**entity** | **String** |  |  [optional] [readonly]
**status** | **String** |  |  [optional] [readonly]


## Implemented Interfaces

* Serializable


