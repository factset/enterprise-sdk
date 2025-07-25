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
import FactSetProtobufStachV3StachV3TableTypesColumn from './FactSetProtobufStachV3StachV3TableTypesColumn';
import FactSetProtobufStachV3Table from './FactSetProtobufStachV3Table';
import FactSetProtobufStachV3ViewsTypesView from './FactSetProtobufStachV3ViewsTypesView';
import GoogleProtobufWellKnownTypesStruct from './GoogleProtobufWellKnownTypesStruct';

/**
 * The FactSetProtobufStachV3StachV3Table model module.
 * @module model/FactSetProtobufStachV3StachV3Table
 */
class FactSetProtobufStachV3StachV3Table {
    /**
     * Constructs a new <code>FactSetProtobufStachV3StachV3Table</code>.
     * @alias module:model/FactSetProtobufStachV3StachV3Table
     */
    constructor() { 
        
        FactSetProtobufStachV3StachV3Table.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FactSetProtobufStachV3StachV3Table</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FactSetProtobufStachV3StachV3Table} obj Optional instance to populate.
     * @return {module:model/FactSetProtobufStachV3StachV3Table} The populated <code>FactSetProtobufStachV3StachV3Table</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FactSetProtobufStachV3StachV3Table();

            if (data.hasOwnProperty('version')) {
                obj['version'] = ApiClient.convertToType(data['version'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('columns')) {
                obj['columns'] = ApiClient.convertToType(data['columns'], [FactSetProtobufStachV3StachV3TableTypesColumn]);
            }
            if (data.hasOwnProperty('table')) {
                obj['table'] = FactSetProtobufStachV3Table.constructFromObject(data['table']);
            }
            if (data.hasOwnProperty('multiLevelHeadersTable')) {
                obj['multiLevelHeadersTable'] = FactSetProtobufStachV3StachV3Table.constructFromObject(data['multiLevelHeadersTable']);
            }
            if (data.hasOwnProperty('views')) {
                obj['views'] = ApiClient.convertToType(data['views'], [FactSetProtobufStachV3ViewsTypesView]);
            }
            if (data.hasOwnProperty('rows')) {
                obj['rows'] = ApiClient.convertToType(data['rows'], [GoogleProtobufWellKnownTypesStruct]);
            }
        }
        return obj;
    }


}

/**
 * @member {String} version
 */
FactSetProtobufStachV3StachV3Table.prototype['version'] = undefined;

/**
 * @member {String} name
 */
FactSetProtobufStachV3StachV3Table.prototype['name'] = undefined;

/**
 * @member {Array.<module:model/FactSetProtobufStachV3StachV3TableTypesColumn>} columns
 */
FactSetProtobufStachV3StachV3Table.prototype['columns'] = undefined;

/**
 * @member {module:model/FactSetProtobufStachV3Table} table
 */
FactSetProtobufStachV3StachV3Table.prototype['table'] = undefined;

/**
 * @member {module:model/FactSetProtobufStachV3StachV3Table} multiLevelHeadersTable
 */
FactSetProtobufStachV3StachV3Table.prototype['multiLevelHeadersTable'] = undefined;

/**
 * @member {Array.<module:model/FactSetProtobufStachV3ViewsTypesView>} views
 */
FactSetProtobufStachV3StachV3Table.prototype['views'] = undefined;

/**
 * @member {Array.<module:model/GoogleProtobufWellKnownTypesStruct>} rows
 */
FactSetProtobufStachV3StachV3Table.prototype['rows'] = undefined;






export default FactSetProtobufStachV3StachV3Table;

