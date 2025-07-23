

# CreateOrEditViewBodyData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the view. |  [optional]
**tickers** | [**java.util.List&lt;CreateOrEditViewTickers&gt;**](CreateOrEditViewTickers.md) | An array of ticker objects associated with the view. |  [optional]
**isPrimary** | **Boolean** | If true, stories that match the provided ticker on which the ticker is a primary symbol will be returned. Additionally, stories that match the other filters specified such as topics or regions will also be returned.   |  [optional]
**categories** | **java.util.List&lt;String&gt;** |  |  [optional]
**topics** | **java.util.List&lt;String&gt;** |  |  [optional]
**regions** | **java.util.List&lt;String&gt;** |  |  [optional]
**sectors** | **java.util.List&lt;String&gt;** |  |  [optional]
**quickAlert** | **Boolean** | Indicates whether quick alerts are enabled for the view. A value of &#39;true&#39; means quick alerts are enabled, while &#39;false&#39; means they are not.  |  [optional]


## Implemented Interfaces

* Serializable


