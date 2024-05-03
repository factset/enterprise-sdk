/**
 * Company Logo API
 * Consume FactSet collected Company Logos through an API that seamlessly integrates with company fundamentals and estimates data (listed equities data available via the stocks API), quotes, time series, and other Digital APIs.  The Logo API provides access to logos of US, CA and EU listed companies. The logos could be accessed by using national and international identifiers like ISIN, CUSIP, WKN, Valor, etc. and are a nice feature for comprehensive visualizations of equities on overview pages (factsheets).  Logos are reviewed/updated twice a year.  The Logo API for Digital Portals seamlessly integrates with the [Stocks API](https://developer.factset.com/api-catalog/stocks-api-digital-portals) for equities and estimates data and the [Quotes API](https://developer.factset.com/api-catalog/quotes-api-digital-portals), allowing access to detailed price and performance information of listings. The [Quotes API](https://developer.factset.com/api-catalog/quotes-api-digital-portals) also supports basic security identifier cross-reference (see for example /notation/crossReference/getByFactSetMarketSymbol to retrieve an instrument id). For direct access to price histories for charting, please refer to the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals). 
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import StatusObject from './StatusObject';

/**
 * The ErrorMetaObject model module.
 * @module model/ErrorMetaObject
 */
class ErrorMetaObject {
    /**
     * Constructs a new <code>ErrorMetaObject</code>.
     * The meta member contains the meta information of the response.
     * @alias module:model/ErrorMetaObject
     */
    constructor() { 
        
        ErrorMetaObject.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ErrorMetaObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ErrorMetaObject} obj Optional instance to populate.
     * @return {module:model/ErrorMetaObject} The populated <code>ErrorMetaObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ErrorMetaObject();

            if (data.hasOwnProperty('status')) {
                obj['status'] = StatusObject.constructFromObject(data['status']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/StatusObject} status
 */
ErrorMetaObject.prototype['status'] = undefined;






export default ErrorMetaObject;

