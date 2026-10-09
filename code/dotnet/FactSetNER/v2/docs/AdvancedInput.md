# FactSet.SDK.FactSetNER.Model.AdvancedInput
Input configuration for Advanced endpoint single-text processing with financial entity support.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Input** | **string** | Text to be processed for entity extraction. Supports single-input processing. | 
**Entities** | [**List&lt;AdvancedEntityType&gt;**](AdvancedEntityType.md) | Array of entity types to extract from the input text. If &#x60;product&#x60; is included, &#x60;organization&#x60; must also be included.  | Entity Type | Description | |- --|- --| | person | Individual names and references to people | | organization | Company names, institutions, and organizational entities | | location | Geographic locations including cities, countries, regions | | product | Commercial products and services | | datetime | Specific dates, times, and temporal expressions | | period | Time periods and durations | | numerical | Numbers, quantities, and numerical expressions | | cryptocurrency | Cryptocurrency names and symbols (e.g., Bitcoin, ETH) | | index | Financial indices and benchmarks (e.g., S&amp;P 500, NASDAQ) | | rate | Interest rates and financial rates | | yield | Bond yields and other financial yields | | commodity | Commodities and raw materials | | currency | Currency codes and currency references | | future | Financial futures contracts | | fund | Investment funds and mutual funds | | asset | Financial assets and asset classes | | debtinstrument | Bonds, notes, and other debt instruments |  | 
**IncludeOffsets** | **bool** | If true, include character offset positions (startChar and endChar) for each extracted entity in the response. | [optional] [default to false]
**PerformLookup** | **bool** | If true, perform entity lookup to resolve extracted entities to FactSet entity identifiers and metadata. | [optional] [default to true]
**Model** | **string** | The model to use for entity extraction, by name (not the underlying gateway ID). Optional — defaults to Llama 4 Scout Instruct if not provided. | [optional] [default to ModelEnum.Llama4ScoutInstruct]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

