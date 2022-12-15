# FactSet.SDK.QuotesAPIforDigitalPortals.Model.InlineResponse20050DataComponents

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Name of the component, provided also if there is no notation for the component. | [optional] 
**ValueUnit** | [**InlineResponse20050DataValueUnit**](InlineResponse20050DataValueUnit.md) |  | [optional] 
**Notation** | [**InlineResponse20050DataNotation**](InlineResponse20050DataNotation.md) |  | [optional] 
**Participation** | **string** | Indicates whether the level of the composite instrument rises or falls with a rising level of the component. The level of a basket always rises with rising level of its components and vice versa; therefore, for those the attribute is not set. The level of an alpha structure or a futures spread is calculated by subtracting the performance (price) of the short component from that of the long one. The level of a factor index rises with rising level of its component if the latter is long, and falls if it is short. For the type of composite instrument, see attribute  &#x60;typeComposite&#x60;. | [optional] 
**NumberShares** | **decimal?** | Absolute number of shares of the component contained in the composite instrument.  The absolute number of shares can be subject to change due to corporate actions or active management of the composite instrument (see attribute &#x60;activeManagement&#x60;). If the component is an index, the number of shares is a factor which applies to the level of the index. | [optional] 
**InitialWeight** | **decimal?** | Weighting of the component, valid only at initial fixing   (see attribute &#x60;initialFixing&#x60; in endpoint &#x60;/securitizedDerivative/get&#x60;).  | [optional] 
**ReferenceLevel** | **decimal?** | Level of the component on the issue date of the derivative product.  For the value unit, see attribute &#x60;valueUnit&#x60;. | [optional] 
**ConstantLeverage** | **decimal?** | For a leveraged component, e.g. a component of a factor index, day-to-day leverage factor of the component&#39;s performance. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

