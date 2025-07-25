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
import FactSetProtobufFormatV1DateTimeFormat from './FactSetProtobufFormatV1DateTimeFormat';
import FactSetProtobufFormatV1NumberFormat from './FactSetProtobufFormatV1NumberFormat';

/**
 * The FactSetProtobufFormatV1FdsFormatSettings model module.
 * @module model/FactSetProtobufFormatV1FdsFormatSettings
 */
class FactSetProtobufFormatV1FdsFormatSettings {
    /**
     * Constructs a new <code>FactSetProtobufFormatV1FdsFormatSettings</code>.
     * @alias module:model/FactSetProtobufFormatV1FdsFormatSettings
     */
    constructor() { 
        
        FactSetProtobufFormatV1FdsFormatSettings.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FactSetProtobufFormatV1FdsFormatSettings</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FactSetProtobufFormatV1FdsFormatSettings} obj Optional instance to populate.
     * @return {module:model/FactSetProtobufFormatV1FdsFormatSettings} The populated <code>FactSetProtobufFormatV1FdsFormatSettings</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FactSetProtobufFormatV1FdsFormatSettings();

            if (data.hasOwnProperty('version')) {
                obj['version'] = ApiClient.convertToType(data['version'], 'String');
            }
            if (data.hasOwnProperty('culture')) {
                obj['culture'] = ApiClient.convertToType(data['culture'], 'String');
            }
            if (data.hasOwnProperty('timeZone')) {
                obj['timeZone'] = ApiClient.convertToType(data['timeZone'], 'String');
            }
            if (data.hasOwnProperty('nullValue')) {
                obj['nullValue'] = ApiClient.convertToType(data['nullValue'], 'String');
            }
            if (data.hasOwnProperty('numberFormat')) {
                obj['numberFormat'] = FactSetProtobufFormatV1NumberFormat.constructFromObject(data['numberFormat']);
            }
            if (data.hasOwnProperty('dateTimeFormat')) {
                obj['dateTimeFormat'] = FactSetProtobufFormatV1DateTimeFormat.constructFromObject(data['dateTimeFormat']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} version
 */
FactSetProtobufFormatV1FdsFormatSettings.prototype['version'] = undefined;

/**
 * @member {String} culture
 */
FactSetProtobufFormatV1FdsFormatSettings.prototype['culture'] = undefined;

/**
 * @member {String} timeZone
 */
FactSetProtobufFormatV1FdsFormatSettings.prototype['timeZone'] = undefined;

/**
 * @member {String} nullValue
 */
FactSetProtobufFormatV1FdsFormatSettings.prototype['nullValue'] = undefined;

/**
 * @member {module:model/FactSetProtobufFormatV1NumberFormat} numberFormat
 */
FactSetProtobufFormatV1FdsFormatSettings.prototype['numberFormat'] = undefined;

/**
 * @member {module:model/FactSetProtobufFormatV1DateTimeFormat} dateTimeFormat
 */
FactSetProtobufFormatV1FdsFormatSettings.prototype['dateTimeFormat'] = undefined;






export default FactSetProtobufFormatV1FdsFormatSettings;

