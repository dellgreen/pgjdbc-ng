/**
 * Copyright (c) 2013, impossibl.com
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *  * Neither the name of impossibl.com nor the names of its contributors may
 *    be used to endorse or promote products derived from this software
 *    without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package com.impossibl.postgres.jdbc;

import com.impossibl.postgres.jdbc.xa.XADataSourceTest;
import com.impossibl.postgres.system.procs.Numerics;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    ArrayTest.class,
    BatchExecuteTest.class,
    BlobTest.class,
    BoundParametersAndFieldsLimitTest.class,
    CallableStatementTest.class,
    CiTextTest.class,
    CodecTest.class,
    ConnectionTest.class,
    CursorFetchTest.class,
    DatabaseMetaDataPropertiesTest.class,
    DatabaseMetaDataTest.class,
    DataSourceTest.class,
    DateTest.class,
    DriverTest.class,
    EnumTest.class,
    ExceptionTest.class,
    GeneratedKeysTest.class,
    GiantBlobTest.class,
    IntervalTest.class,
    LeakTest.class,
    LockTest.class,
    MultiSchemasStructsTest.class,
    NetworkTest.class,
    NotificationTest.class,
    Numerics.class,
    ParameterMetaDataTest.class,
    PreparedStatementTest.class,
    PsuedoRecordTest.class,
    ResultSetMetaDataTest.class,
    ResultSetTest.class,
    SavepointTest.class,
    ServerDisconnectTest.class,
    ServerErrorTest.class,
    SQLTextTests.class,
    SSLDataSourceTest.class,
    SSLTest.class,
    StatementTest.class,
    StructTest.class,
    TimestampTest.class,
    TimeTest.class,
    TimezoneTest.class,
    TruncateTest.class,
    UpdateableResultTest.class,
    UUIDTest.class,
    VersionTest.class,
    WrapperTest.class,
    XmlTest.class,
    XADataSourceTest.class,
})
public class RequiredTests {

}
