/**
 * GIPS API
 * Allow clients to use GIPS through APIs.
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The FactSetProtobufFormatV1NumberFormatTypesPercentStandardSpecifier model module.
 * @module model/FactSetProtobufFormatV1NumberFormatTypesPercentStandardSpecifier
 */
class FactSetProtobufFormatV1NumberFormatTypesPercentStandardSpecifier {
    /**
     * Constructs a new <code>FactSetProtobufFormatV1NumberFormatTypesPercentStandardSpecifier</code>.
     * @alias module:model/FactSetProtobufFormatV1NumberFormatTypesPercentStandardSpecifier
     */
    constructor() { 
        
        FactSetProtobufFormatV1NumberFormatTypesPercentStandardSpecifier.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FactSetProtobufFormatV1NumberFormatTypesPercentStandardSpecifier</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FactSetProtobufFormatV1NumberFormatTypesPercentStandardSpecifier} obj Optional instance to populate.
     * @return {module:model/FactSetProtobufFormatV1NumberFormatTypesPercentStandardSpecifier} The populated <code>FactSetProtobufFormatV1NumberFormatTypesPercentStandardSpecifier</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FactSetProtobufFormatV1NumberFormatTypesPercentStandardSpecifier();

            if (data.hasOwnProperty('decimalDigits')) {
                obj['decimalDigits'] = ApiClient.convertToType(data['decimalDigits'], 'Number');
            }
            if (data.hasOwnProperty('decimalSeparator')) {
                obj['decimalSeparator'] = ApiClient.convertToType(data['decimalSeparator'], 'String');
            }
            if (data.hasOwnProperty('groupSeparator')) {
                obj['groupSeparator'] = ApiClient.convertToType(data['groupSeparator'], 'String');
            }
            if (data.hasOwnProperty('groupSizes')) {
                obj['groupSizes'] = ApiClient.convertToType(data['groupSizes'], ['Number']);
            }
            if (data.hasOwnProperty('negativePattern')) {
                obj['negativePattern'] = ApiClient.convertToType(data['negativePattern'], 'String');
            }
            if (data.hasOwnProperty('positivePattern')) {
                obj['positivePattern'] = ApiClient.convertToType(data['positivePattern'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {Number} decimalDigits
 */
FactSetProtobufFormatV1NumberFormatTypesPercentStandardSpecifier.prototype['decimalDigits'] = undefined;

/**
 * @member {String} decimalSeparator
 */
FactSetProtobufFormatV1NumberFormatTypesPercentStandardSpecifier.prototype['decimalSeparator'] = undefined;

/**
 * @member {String} groupSeparator
 */
FactSetProtobufFormatV1NumberFormatTypesPercentStandardSpecifier.prototype['groupSeparator'] = undefined;

/**
 * @member {Array.<Number>} groupSizes
 */
FactSetProtobufFormatV1NumberFormatTypesPercentStandardSpecifier.prototype['groupSizes'] = undefined;

/**
 * @member {String} negativePattern
 */
FactSetProtobufFormatV1NumberFormatTypesPercentStandardSpecifier.prototype['negativePattern'] = undefined;

/**
 * @member {String} positivePattern
 */
FactSetProtobufFormatV1NumberFormatTypesPercentStandardSpecifier.prototype['positivePattern'] = undefined;






export default FactSetProtobufFormatV1NumberFormatTypesPercentStandardSpecifier;

