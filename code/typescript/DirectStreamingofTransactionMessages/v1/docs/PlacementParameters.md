# directstreamingoftransactionmessages.PlacementParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionStatus** | **String** | Transaction Status of a Placement could be any of the following values: Placed, PartialFilled, Filled, Expired, Cancelled, Rejected. | 
**parentId** | **String** | Unique Id of the order which spawned this placement | [optional] 
**instructionType** | **String** | Instruction Type of a Placement could be any of the following values: Market, Limit, Stop | [optional] 
**instructionValue** | **Number** | InstructionValue for a Placement | [optional] 
**tif** | **String** | TIF of an Order could be any of the following values: GTC, GTD, D, W | [optional] 
**tifDate** | **String** | TIF date which is in the format YYYY-MM-DD | [optional] 
**transactionId** | **String** | Unique Id for the transaction | 
**orderId** | **String** | Unique Id of the order which originated the record | [optional] 
**portfolio** | **String** | Path of the portfolio (Ex: Client:/folder1/testing.ofdb) | 
**symbol** | **String** | Symbol corresponding to the traded instrument. | 
**description** | **String** | Description | 
**tradeType** | **String** | Trade type could be any of the following values BL, BC, SL, SS.  which stands for Buy Long, Buy to cover, Sell Long and Sell Short respectively. | 
**unitType** | **String** | Unit type could be one of Quantity or Value. | 
**transactionLeaves** | **Number** | Shares that have been ordered and not executed | [optional] 
**quantity** | **Number** | Quantity of the instrument traded. | 
**gross** | **Number** | Cash value of the transaction | 
**price** | **Number** | The transaction price | [optional] 
**currencyISO** | **String** | The currency code of cash valued fields, Net Amount and Gross Amount. | 
**tradeDate** | **String** | Trade date which is in the format YYYY-MM-DD | 
**addedDateTime** | **String** | Date and time expressed in UTC when the transaction was first added in the format YYYY-MM-DDTHH:MM:SS.FFF | [optional] 
**updatedDateTime** | **String** | Date and time expressed in UTC when the transaction was last updated in the format YYYY-MM-DDTHH:MM:SS.FFF | [optional] 
**entity** | **String** |  | [optional] [readonly] 
**status** | **String** |  | [optional] [readonly] 


