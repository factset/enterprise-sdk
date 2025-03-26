/**
 * Tick History
 * Tick History provides dynamic access to historical tick data for a specific security for specific dates or date range.
 *
 * The version of the OpenAPI document: 2.4.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import DateTimePeriodMin from './DateTimePeriodMin';
import Granularity from './Granularity';
import Type from './Type';

/**
 * The MinutesbarRequestBody model module.
 * @module model/MinutesbarRequestBody
 */
class MinutesbarRequestBody {
    /**
     * Constructs a new <code>MinutesbarRequestBody</code>.
     * Level1 Minute bars request body elements
     * @alias module:model/MinutesbarRequestBody
     * @param tickers {Array.<String>} The requested list of one or more tickers. <p> NOTE: Maximum 500 tickers per request.</p>.   
     * @param factsetExchangeCode {String} FactSet specific regional or composite exchange code and last exchange code. <p> NOTE:Does not support multiple factsetExchangeCodes</p>. 
     * @param dateTimeRange {module:model/DateTimePeriodMin} 
     * @param granularity {module:model/Granularity} 
     * @param type {module:model/Type} 
     */
    constructor(tickers, factsetExchangeCode, dateTimeRange, granularity, type) { 
        
        MinutesbarRequestBody.initialize(this, tickers, factsetExchangeCode, dateTimeRange, granularity, type);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, tickers, factsetExchangeCode, dateTimeRange, granularity, type) { 
        obj['tickers'] = tickers;
        obj['factsetExchangeCode'] = factsetExchangeCode;
        obj['dateTimeRange'] = dateTimeRange;
        obj['granularity'] = granularity;
        obj['type'] = type;
    }

    /**
     * Constructs a <code>MinutesbarRequestBody</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/MinutesbarRequestBody} obj Optional instance to populate.
     * @return {module:model/MinutesbarRequestBody} The populated <code>MinutesbarRequestBody</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MinutesbarRequestBody();

            if (data.hasOwnProperty('tickers')) {
                obj['tickers'] = ApiClient.convertToType(data['tickers'], ['String']);
            }
            if (data.hasOwnProperty('factsetExchangeCode')) {
                obj['factsetExchangeCode'] = ApiClient.convertToType(data['factsetExchangeCode'], 'String');
            }
            if (data.hasOwnProperty('dateTimeRange')) {
                obj['dateTimeRange'] = DateTimePeriodMin.constructFromObject(data['dateTimeRange']);
            }
            if (data.hasOwnProperty('granularity')) {
                obj['granularity'] = Granularity.constructFromObject(data['granularity']);
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = Type.constructFromObject(data['type']);
            }
        }
        return obj;
    }


}

/**
 * The requested list of one or more tickers. <p> NOTE: Maximum 500 tickers per request.</p>.   
 * @member {Array.<String>} tickers
 */
MinutesbarRequestBody.prototype['tickers'] = undefined;

/**
 * FactSet specific regional or composite exchange code and last exchange code. <p> NOTE:Does not support multiple factsetExchangeCodes</p>. 
 * @member {String} factsetExchangeCode
 */
MinutesbarRequestBody.prototype['factsetExchangeCode'] = undefined;

/**
 * @member {module:model/DateTimePeriodMin} dateTimeRange
 */
MinutesbarRequestBody.prototype['dateTimeRange'] = undefined;

/**
 * @member {module:model/Granularity} granularity
 */
MinutesbarRequestBody.prototype['granularity'] = undefined;

/**
 * @member {module:model/Type} type
 */
MinutesbarRequestBody.prototype['type'] = undefined;






export default MinutesbarRequestBody;

