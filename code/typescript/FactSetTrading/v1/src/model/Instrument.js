/**
 * Trading API
 * Allow clients to trade orders.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The Instrument model module.
 * @module model/Instrument
 */
class Instrument {
    /**
     * Constructs a new <code>Instrument</code>.
     * Instrument
     * @alias module:model/Instrument
     * @param symbol {String} Ticker symbol
     */
    constructor(symbol) { 
        
        Instrument.initialize(this, symbol);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, symbol) { 
        obj['symbol'] = symbol;
    }

    /**
     * Constructs a <code>Instrument</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Instrument} obj Optional instance to populate.
     * @return {module:model/Instrument} The populated <code>Instrument</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Instrument();

            if (data.hasOwnProperty('symbol')) {
                obj['symbol'] = ApiClient.convertToType(data['symbol'], 'String');
            }
            if (data.hasOwnProperty('securityType')) {
                obj['securityType'] = ApiClient.convertToType(data['securityType'], 'String');
            }
            if (data.hasOwnProperty('cfiCode')) {
                obj['cfiCode'] = ApiClient.convertToType(data['cfiCode'], 'String');
            }
            if (data.hasOwnProperty('securityExchange')) {
                obj['securityExchange'] = ApiClient.convertToType(data['securityExchange'], 'String');
            }
            if (data.hasOwnProperty('issuer')) {
                obj['issuer'] = ApiClient.convertToType(data['issuer'], 'String');
            }
            if (data.hasOwnProperty('securityDescription')) {
                obj['securityDescription'] = ApiClient.convertToType(data['securityDescription'], 'String');
            }
            if (data.hasOwnProperty('maturityMonthYear')) {
                obj['maturityMonthYear'] = ApiClient.convertToType(data['maturityMonthYear'], 'String');
            }
            if (data.hasOwnProperty('maturityDay')) {
                obj['maturityDay'] = ApiClient.convertToType(data['maturityDay'], 'String');
            }
            if (data.hasOwnProperty('putOrCall')) {
                obj['putOrCall'] = ApiClient.convertToType(data['putOrCall'], 'String');
            }
            if (data.hasOwnProperty('underlyingSecurityType')) {
                obj['underlyingSecurityType'] = ApiClient.convertToType(data['underlyingSecurityType'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Ticker symbol
 * @member {String} symbol
 */
Instrument.prototype['symbol'] = undefined;

/**
 * Indicates type of security.
 * @member {String} securityType
 */
Instrument.prototype['securityType'] = undefined;

/**
 * Classification of Financial Instruments. Indicates the type of security using ISO 0962 standard.
 * @member {String} cfiCode
 */
Instrument.prototype['cfiCode'] = undefined;

/**
 * Market used to help identify a security.
 * @member {String} securityExchange
 */
Instrument.prototype['securityExchange'] = undefined;

/**
 * Company name of security issuer.
 * @member {String} issuer
 */
Instrument.prototype['issuer'] = undefined;

/**
 * Security Description
 * @member {String} securityDescription
 */
Instrument.prototype['securityDescription'] = undefined;

/**
 * Month and Year of the maturity.
 * @member {String} maturityMonthYear
 */
Instrument.prototype['maturityMonthYear'] = undefined;

/**
 * Day of month used in conjunction with maturityMonthYear to specify the maturity date
 * @member {String} maturityDay
 */
Instrument.prototype['maturityDay'] = undefined;

/**
 * Indicates whether an Option is for a put or call.
 * @member {module:model/Instrument.PutOrCallEnum} putOrCall
 */
Instrument.prototype['putOrCall'] = undefined;

/**
 * Underlying security’s SecurityType.
 * @member {String} underlyingSecurityType
 */
Instrument.prototype['underlyingSecurityType'] = undefined;





/**
 * Allowed values for the <code>putOrCall</code> property.
 * @enum {String}
 * @readonly
 */
Instrument['PutOrCallEnum'] = {

    /**
     * value: "put"
     * @const
     */
    "put": "put",

    /**
     * value: "call"
     * @const
     */
    "call": "call"
};



export default Instrument;

