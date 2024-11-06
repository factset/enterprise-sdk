# factsetestimates.DetailRatings

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** |  | [optional] 
**estimateDate** | **Date** | Date of estimate expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598) | [optional] 
**analystId** | **String** | The FactSet Entity Identifier for the analyst making the estimate. | [optional] 
**analystName** | **String** | The name of the analyst making the estimate. | [optional] 
**brokerId** | **String** | The FactSet Entity Identifier for the broker making the estimate. | [optional] 
**brokerName** | **String** | The name of the broker making the estimate. | [optional] 
**ratingsNoteText** | **String** | A textual representation of the analysts rating. Broker recommendations are divided into five main broad categories- **Buy, overWeight, Hold, underWeight, and Sell**.&lt;p&gt;Additional recommendations may be displayed for the below reasons -  * Without- A rating \&quot;Without\&quot; is displayed when a broker provides estimates but does not provide a rating. * Dropping- When a broker stops covering an equity, the recommendation will show \&quot;Dropping.\&quot; * Not Available- A broker may be \&quot;Not Available\&quot; due to outstanding circumstances with that particular security. Ratings are not displayed until a new rating is provided. * Most/Least- \&quot;Most\&quot; or \&quot;Least\&quot; favorable rating is displayed for top or bottom rating available for a particular security.  | [optional] 
**requestId** | **String** | Identifier that was used for the request. | [optional] 
**inputDateTime** | **String** | Date and time when the data is available at the source. | [optional] 
**lastModifiedDate** | **Date** | The date at which a broker provided an estimate that is a revision. | [optional] 


