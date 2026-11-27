package com.example.p11.repositori

import com.example.p11.apiservice.ServiceApiSiswa
import com.example.p11.modeldata.DataSiswa
import retrofit2.Response

interface RepositoryDataSiswa {
    suspend fun getDataSiswa(): List<DataSiswa>
    suspend fun postDataSiswa(dataSiswa: DataSiswa): Response<Void>
}

class JaringanRepositoryDataSiswa(
    private val serviceApiSiswa: ServiceApiSiswa
) : RepositoryDataSiswa {
    override suspend fun getDataSiswa(): List<DataSiswa> {
        return serviceApiSiswa.getSiswa()
    }

    override suspend fun postDataSiswa(dataSiswa: DataSiswa): Response<Void> {
        return serviceApiSiswa.postSiswa(dataSiswa)
    }
}