/**
 * Company Logo API
 * Consume FactSet collected Company Logos through an API that seamlessly integrates with company fundamentals and estimates data (listed equities data available via the stocks API), quotes, time series, and other Digital APIs.  The logo API provides access to logos for a global universe of listed companies. The logos could be accessed by using national and international identifiers like ISIN, CUSIP, WKN, Valor, etc. and are a nice feature for comprehensive visualizations of equities on overview pages (factsheets).  Logo collection and maintenance takes into account IPOs, M&A notifications, and further consistency check mechanisms.  The Company Logo API seamlessly integrates with the [Stocks API](https://developer.factset.com/api-catalog/stocks-api-digital-portals) for equities and estimates data and the [Quotes API](https://developer.factset.com/api-catalog/real-time-quotes-api), allowing access to detailed price and performance information of listings. The [Quotes API](https://developer.factset.com/api-catalog/real-time-quotes-api) also supports basic security identifier cross-reference (see for example /notation/crossReference/getByFactSetMarketSymbol to retrieve an instrument id). For direct access to price histories for charting, please refer to the [Real-Time Time Series API](https://developer.factset.com/api-catalog/real-time-time-series-api).   
 *
 * The version of the OpenAPI document: 4.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import InlineResponse200DataLarge from './InlineResponse200DataLarge';
import InlineResponse200DataMedium from './InlineResponse200DataMedium';
import InlineResponse200DataSmall from './InlineResponse200DataSmall';
import InlineResponse200DataVector from './InlineResponse200DataVector';

/**
 * The InlineResponse200Data model module.
 * @module model/InlineResponse200Data
 */
class InlineResponse200Data {
    /**
     * Constructs a new <code>InlineResponse200Data</code>.
     * URLs of company logos. All URLs are publicly available via HTTPS and hosted by FactSet with a top-level domain &#x60;mdgms.com&#x60;. For possible values of the attribute &#x60;mimeType&#x60;, see endpoint &#x60;/basic/media/type/list&#x60; with parameter &#x60;filter.ids&#x3D;1 (image)&#x60;.
     * @alias module:model/InlineResponse200Data
     */
    constructor() { 
        
        InlineResponse200Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse200Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse200Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse200Data} The populated <code>InlineResponse200Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse200Data();

            if (data.hasOwnProperty('idInstrument')) {
                obj['idInstrument'] = ApiClient.convertToType(data['idInstrument'], 'String');
            }
            if (data.hasOwnProperty('sourceIdentifier')) {
                obj['sourceIdentifier'] = ApiClient.convertToType(data['sourceIdentifier'], 'String');
            }
            if (data.hasOwnProperty('small')) {
                obj['small'] = InlineResponse200DataSmall.constructFromObject(data['small']);
            }
            if (data.hasOwnProperty('medium')) {
                obj['medium'] = InlineResponse200DataMedium.constructFromObject(data['medium']);
            }
            if (data.hasOwnProperty('large')) {
                obj['large'] = InlineResponse200DataLarge.constructFromObject(data['large']);
            }
            if (data.hasOwnProperty('vector')) {
                obj['vector'] = InlineResponse200DataVector.constructFromObject(data['vector']);
            }
        }
        return obj;
    }


}

/**
 * MDG identifier of the instrument.
 * @member {String} idInstrument
 */
InlineResponse200Data.prototype['idInstrument'] = undefined;

/**
 * Identifier used in the request.
 * @member {String} sourceIdentifier
 */
InlineResponse200Data.prototype['sourceIdentifier'] = undefined;

/**
 * @member {module:model/InlineResponse200DataSmall} small
 */
InlineResponse200Data.prototype['small'] = undefined;

/**
 * @member {module:model/InlineResponse200DataMedium} medium
 */
InlineResponse200Data.prototype['medium'] = undefined;

/**
 * @member {module:model/InlineResponse200DataLarge} large
 */
InlineResponse200Data.prototype['large'] = undefined;

/**
 * @member {module:model/InlineResponse200DataVector} vector
 */
InlineResponse200Data.prototype['vector'] = undefined;






export default InlineResponse200Data;

