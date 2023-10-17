

# InlineResponse20062DataCostsAndCharges

MiFID cost is the disclosure of information on costs and charges related to an investment product and on the investment or ancillary service provided to a client. MiFID distinguishes between ex-ante and ex-post disclosure of costs.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quotation** | [**QuotationEnum**](#QuotationEnum) | Quotation type originally used for providing most of the cost items of the investment product. |  [optional]
**exAnte** | [**InlineResponse20062DataCostsAndChargesExAnte**](InlineResponse20062DataCostsAndChargesExAnte.md) |  |  [optional]
**exPost** | [**InlineResponse20062DataCostsAndChargesExPost**](InlineResponse20062DataCostsAndChargesExPost.md) |  |  [optional]



## Enum: QuotationEnum

Name | Value
---- | -----
CURRENCY | &quot;currency&quot;
PERCENT | &quot;percent&quot;


## Implemented Interfaces

* Serializable


