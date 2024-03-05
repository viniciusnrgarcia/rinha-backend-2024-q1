var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name--1146707516",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "123",
        "ok": "118",
        "ko": "5"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "1"
    },
    "maxResponseTime": {
        "total": "97",
        "ok": "97",
        "ko": "2"
    },
    "meanResponseTime": {
        "total": "19",
        "ok": "20",
        "ko": "2"
    },
    "standardDeviation": {
        "total": "31",
        "ok": "31",
        "ko": "0"
    },
    "percentiles1": {
        "total": "4",
        "ok": "4",
        "ko": "2"
    },
    "percentiles2": {
        "total": "8",
        "ok": "9",
        "ko": "2"
    },
    "percentiles3": {
        "total": "89",
        "ok": "91",
        "ko": "2"
    },
    "percentiles4": {
        "total": "96",
        "ok": "96",
        "ko": "2"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 118,
    "percentage": 96
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 5,
    "percentage": 4
},
    "meanNumberOfRequestsPerSecond": {
        "total": "24.6",
        "ok": "23.6",
        "ko": "1"
    }
},
contents: {
"req_validac-o-es--40002687": {
        type: "REQUEST",
        name: "validações",
path: "validações",
pathFormatted: "req_validac-o-es--40002687",
stats: {
    "name": "validações",
    "numberOfRequests": {
        "total": "123",
        "ok": "118",
        "ko": "5"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "1"
    },
    "maxResponseTime": {
        "total": "97",
        "ok": "97",
        "ko": "2"
    },
    "meanResponseTime": {
        "total": "19",
        "ok": "20",
        "ko": "2"
    },
    "standardDeviation": {
        "total": "31",
        "ok": "31",
        "ko": "0"
    },
    "percentiles1": {
        "total": "4",
        "ok": "4",
        "ko": "2"
    },
    "percentiles2": {
        "total": "8",
        "ok": "9",
        "ko": "2"
    },
    "percentiles3": {
        "total": "89",
        "ok": "91",
        "ko": "2"
    },
    "percentiles4": {
        "total": "96",
        "ok": "96",
        "ko": "2"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 118,
    "percentage": 96
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 5,
    "percentage": 4
},
    "meanNumberOfRequestsPerSecond": {
        "total": "24.6",
        "ok": "23.6",
        "ko": "1"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
