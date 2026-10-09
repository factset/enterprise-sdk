# factsetner.AdvancedInput

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**input** | **String** | Text to be processed for entity extraction. Supports single-input processing. | 
**entities** | [**[AdvancedEntityType]**](AdvancedEntityType.md) | Array of entity types to extract from the input text. If &#x60;product&#x60; is included, &#x60;organization&#x60; must also be included.  | Entity Type | Description | |---|---| | person | Individual names and references to people | | organization | Company names, institutions, and organizational entities | | location | Geographic locations including cities, countries, regions | | product | Commercial products and services | | datetime | Specific dates, times, and temporal expressions | | period | Time periods and durations | | numerical | Numbers, quantities, and numerical expressions | | cryptocurrency | Cryptocurrency names and symbols (e.g., Bitcoin, ETH) | | index | Financial indices and benchmarks (e.g., S&amp;P 500, NASDAQ) | | rate | Interest rates and financial rates | | yield | Bond yields and other financial yields | | commodity | Commodities and raw materials | | currency | Currency codes and currency references | | future | Financial futures contracts | | fund | Investment funds and mutual funds | | asset | Financial assets and asset classes | | debtinstrument | Bonds, notes, and other debt instruments |  | 
**includeOffsets** | **Boolean** | If true, include character offset positions (startChar and endChar) for each extracted entity in the response. | [optional] [default to false]
**performLookup** | **Boolean** | If true, perform entity lookup to resolve extracted entities to FactSet entity identifiers and metadata. | [optional] [default to true]
**model** | **String** | The model to use for entity extraction, by name (not the underlying gateway ID). Optional — defaults to Llama 4 Scout Instruct if not provided. | [optional] [default to &#39;Llama 4 Scout Instruct&#39;]



## Enum: ModelEnum


* `GPT 5.2` (value: `"GPT 5.2"`)

* `Claude Sonnet 4.6` (value: `"Claude Sonnet 4.6"`)

* `Llama 4 Scout Instruct` (value: `"Llama 4 Scout Instruct"`)




